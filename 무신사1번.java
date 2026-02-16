import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 무신사1번 {

    static class Size {
        String name;
        int minHeight, maxHeight;
        int minChest, maxChest;
        int minWaist, maxWaist;

        Size(String name, int minHeight, int maxHeight,
            int minChest, int maxChest,
            int minWaist, int maxWaist
        ) {
            this.name = name;
            this.minHeight = minHeight;
            this.maxHeight = maxHeight;
            this.minChest = minChest;
            this.maxChest = maxChest;
            this.minWaist = minWaist;
            this.maxWaist = maxWaist;
        }

        boolean fits(int height, int chest, int waist) {
            return height >= minHeight && height <= maxHeight
            && chest >= minChest && chest <= maxChest
            && waist >= minWaist && waist <= maxWaist;
        }
    }
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1. 브랜드 개수, 고객 수
        String[] first = br.readLine().split(",");
        int brandCount = Integer.parseInt(first[0]);
        int customerCount = Integer.parseInt(first[1]);

        Map<String, List<Size>> brandMap = new HashMap<>();

        //2. 브랜드 정보 입력
        for (int i=0; i<brandCount; i++) {
            String[] brandInput = br.readLine().split(",");
            String brandName = brandInput[0];
            int sizeCount = Integer.parseInt(brandInput[1]);

            List<Size> sizes = new ArrayList<>();

            for (int j=0; j<sizeCount; j++) {
                String[] sizeInput = br.readLine().split(",");
                String sizeName = sizeInput[0];
                int minH = Integer.parseInt(sizeInput[1]);
                int maxH = Integer.parseInt(sizeInput[2]);
                int minC = Integer.parseInt(sizeInput[3]);
                int maxC = Integer.parseInt(sizeInput[4]);
                int minW = Integer.parseInt(sizeInput[5]);
                int maxW = Integer.parseInt(sizeInput[6]);

                sizes.add(new Size(sizeName, minH, maxH, minC, maxC, minW, maxW));
            }

            brandMap.put(brandName, sizes);
        }

        //3. 고객 처리
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<customerCount; i++) {
            String[] customer = br.readLine().split(",");
            String wantBrand = customer[0];
            int height = Integer.parseInt(customer[1]);
            int chest = Integer.parseInt(customer[2]);
            int waist = Integer.parseInt(customer[3]);

            //브랜드 없을 때
            if (!brandMap.containsKey(wantBrand)) {
                sb.append(wantBrand).append(", UNKNOWN\n");
                continue;
            }

            List<Size> sizes = brandMap.get(wantBrand);
            boolean matched = false;

            for (Size size : sizes) {
                if (size.fits(height, chest, waist)) {
                    sb.append(wantBrand).append(", ").append(size.name).append("\n");
                    matched = true;
                    break;
                }
            }

            if (matched) continue;

            // UP/DOWN 판별
            int minHeight = Integer.MAX_VALUE;
            int maxHeight = Integer.MIN_VALUE;
            int minChest = Integer.MAX_VALUE;
            int maxChest = Integer.MIN_VALUE;
            int minWaist = Integer.MAX_VALUE;
            int maxWaist = Integer.MIN_VALUE;

            //이 브랜드의 전체 사이즈 중 가장 작은 값과 큰 값을 구함
            for (Size size : sizes) {
                minHeight = Math.min(minHeight, size.minHeight);
                maxHeight = Math.max(maxHeight, size.maxHeight);
                minChest = Math.min(minChest, size.minChest);
                maxChest = Math.max(maxChest, size.maxChest);
                minWaist = Math.min(minWaist, size.minWaist);
                maxWaist = Math.max(maxWaist, size.maxWaist);
            }

            if (height > maxHeight || waist > maxWaist || chest > maxChest) {
                sb.append(wantBrand).append(", UP\n");
            } else if (height < minHeight || chest < minChest || waist < minWaist) {
                sb.append(wantBrand).append(", DOWN\n");
            }
        }

        System.out.println(sb.toString());
    }
}
