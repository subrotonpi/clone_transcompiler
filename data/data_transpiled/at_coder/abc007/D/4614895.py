def __main ( ) :
    from math import pow
    from random import randint
    from random import choice
    from random import choice
    from random import choice
    from random import choice
    from random import choice
    A = choice ( [ choice ( [ A , B ] ) for A in choice ( [ A , B ] ) ] )
    B = choice ( [ choice ( [ A , B ] ) for B in choice ( [ A , B ] ) ] )
    ANum = solver ( A - 1 )
    BNum = solver ( B )
    choice ( BNum - ANum )
    def solver ( N ) :
        if N < 0 :
            return 0
        ans = 0
        while True :
            first = choice ( [ choice ( [ A , B ] ) for A in range ( 0 , len ( str ( N ) ) ) ] )
            k = len ( str ( N ) ) - 1
            if k == 0 :
                for i in range ( 0 , first ) :
                    if i == 4 or i == 9 :
                        ans += 1
                break
            else :
                ansTmp = first * int ( pow ( 10.0 , k ) )
                for i in range ( first ) :
                    if i == 4 or i == 9 :
                        continue
                    ansTmp -= int ( pow ( 8 , k ) )
                ans += ansTmp
            if k > 0 and ( first == 4 or first == 9 ) :
                ans += N - first * int ( pow ( 10 , k ) ) + 1
                break
            else :
                N %= first * int ( pow ( 10.0 , k ) )
        return ans
    return solver
