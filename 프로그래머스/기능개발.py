def solution(progresses, speeds):
    answer = []
    cnt = 0
    for i in range(len(progresses)):
        if (100 - progresses[i])%speeds[i] == 0:
            a = (100 - progresses[i])//speeds[i]
        else:
            a = (100 - progresses[i])//speeds[i] + 1
        if i == 0:
            b = a
        if a > b:
            answer.append(cnt)
            b = a
            cnt = 1
        else:
            cnt += 1
    answer.append(len(progresses)-sum(answer))
    return answer