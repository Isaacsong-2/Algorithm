def solution(word):
    answer = 0
    for i in range(len(word)):
        if word[i] == 'A':
            answer += 1
        if word[i] == 'E':
            answer += (pow(5, 5-i)-1)/4 * 1 + 1
        if word[i] == 'I':
            answer += (pow(5, 5-i)-1)/4 * 2 + 1
        if word[i] == 'O':
            answer += (pow(5, 5-i)-1)/4 * 3 + 1
        if word[i] == 'U':
            answer += (pow(5, 5-i)-1)/4 * 4 + 1
    return answer
