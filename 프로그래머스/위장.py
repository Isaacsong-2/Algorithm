def solution(clothes):
    answer = 1
    clothes.sort(key=lambda x: x[1])
    # print(clothes)
    a = clothes[0][1]
    cnt = 1
    for i in range(1, len(clothes)):
        if clothes[i][1] != a:
            a = clothes[i][1]
            answer *= cnt + 1
            cnt = 1
        else:
            cnt = cnt + 1
    return (cnt+1)*answer-1
