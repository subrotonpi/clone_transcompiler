def _ _ main _ _ ( ) :
    from os import system , random
    from os import urandom
    from os import urandom
    from random import randint
    from itertools import chain , repeat
    from itertools import chain , repeat
    colors = 'ROYGBV'
    no = 'IMPOSSIBLE'
    def solve ( ) :
        for i in range ( 1 , 5 , 2 ) :
            if a [ i ] and a [ ( i + 3 ) % 6 ] == a [ i ] :
                c = 0
                for j in range ( 6 ) :
                    if a [ j ] :
                        c += 1
                if c == 2 :
                    s = ''
                    for j in range ( 3 ) :
                        s += colors [ i ]
                        s += colors [ ( i + 3 ) % 6 ]
                    return s
            if a [ i ] and a [ ( i + 3 ) % 6 ] <= a [ i ] :
                return no
            a [ ( i + 3 ) % 6 ] -= a [ i ]
        for i in range ( 0 , 4 , 2 ) :
            if a [ i ] > a [ ( i + 2 ) % 6 ] + a [ ( i + 4 ) % 6 ] :
                return no
        s = ''
        p = - 1
        f = - 1
        for _ in range ( 0 , 4 , 2 ) :
            q = - 1
            for i in range ( 0 , 4 , 2 ) :
                if i == p :
                    continue
                if q == - 1 or a [ i ] > a [ q ] or a [ i ] == a [ q ] and i == f :
                    q = i
            if a [ q ] == 0 :
                break
            a [ q ] -= 1
            s += colors [ q ]
            if p == - 1 :
                f = q
            p = q
        for i in range ( 1 , 5 , 2 ) :
            ci = colors [ i ]
            co = colors [ ( i + 3 ) % 6 ]
            from os.path import join
            to = join ( dirname ( dirname ( dirname ( dirname ( dirname ( dirname ( dirname ( dirname ( __file__ ) ) ) ) ) ) ) ) , ci , co )
            for j in range ( 6 ) :
                s = join