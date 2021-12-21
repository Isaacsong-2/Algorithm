def solution(genres, plays):
    answer = []
    a = {}
    d = {}
    for i in range(len(plays)):
        genre = genres[i]
        play = plays[i]
        a[genre] = a.get(genre, 0) + play
        d[genre] = d.get(genre, []) + [(play, i)]
        gensort = sorted(a.items(), key=lambda x: x[1], reverse=True)
    for (genre, total) in gensort:
        d[genre] = sorted(d[genre], key=lambda x: (-x[0], x[1]))
        answer += [idx for (play, idx) in d[genre][:2]]

    return answer
