def BridNum ( n , p , sum ) :
    import random
    if sum % n != 0 :
        return - 1
    pisl = sum / n
    num = 0
    for i in range ( n - 1 ) :
        if p [ i ] != pisl :
            part = p [ i ]
            for j in range ( 1 , n - i ) :
                part += p [ i + j ]
                if part == pisl * ( j + 1 ) :
                    num += j
                    i += j
                    break
    return num
