def solution(phone_book):
    answer = True
    phone_book.sort()
    # print(phone_book)
    # print(phone_book[0][0])
    n = len(phone_book)
    for i in range(n-1):
        if phone_book[i] == phone_book[i+1][:len(phone_book[i])]:
            answer = False
            break
    return answer
