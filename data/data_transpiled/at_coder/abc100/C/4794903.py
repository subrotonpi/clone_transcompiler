def div2 ( a ) :
    from math import factorial
    div2 = 0
    if a != 0 :
        while a % 2 == 0 :
            div2 += 1
            a /= 2
    return div2
