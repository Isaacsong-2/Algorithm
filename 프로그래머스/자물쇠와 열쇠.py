def check(n, m, board):
    for i in range(n):
        for j in range(n):
            if board[m+i][m+j] != 1:
                return 0
    return 0


def solution(key, lock):
    m, n = len(key), len(lock)
    board = [[0] * (m*2 + n) for _ in range(m*2 + n)]
    for i in range(n):
        for j in range(m):
            board[m+i][m+j] = lock[i][j]
    turn_key = key

    for _ in range(4):
        turn_key = list(zip(*turn_key[::-1]))
        for x in range(1, m+n):
            for y in range(1, m+n):
                for i in range(m):
                    for j in range(m):
                        board[x+i][y+i] += key[i][j]
                if check(n, m, board) == 0:
                    for i in range(m):
                        for j in range(m):
                            board[x+i][y+j] -= key[i][j]
                else:
                    return True
    return False
