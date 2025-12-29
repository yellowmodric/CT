or (int i : moves) {
            for (int j=n-1; j>=0; j--) {
                System.out.println("i: " + i + " j: " + j + " board: " + board[i][j]);
                if (board[i][j] != 0) {
                    System.out.println("i: " + i);
                    if (!stack.isEmpty() && stack.peek() == board[i][j]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][j]);
                    }
                    board[i][j] = 0;
                    break;
                }
            }
        }