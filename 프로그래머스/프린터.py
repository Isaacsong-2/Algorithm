def solution(priorities, location):
    answer = 1
    a = priorities[location]
    while(len(priorities) != 0):
        if priorities[0] == max(priorities):
            if location == 0:
                return answer
            else:
                location -= 1
            priorities.pop(0)
            answer += 1
        else:
            if location == 0:
                location = len(priorities) - 1
            else:
                location -= 1
            priorities.append(priorities[0])
            priorities.pop(0)
    return answer
