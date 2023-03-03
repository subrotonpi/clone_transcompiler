def _ ( ) :
    import sys
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    T = string.atoi
    num = [ 0 , 6 , 2 , 8 , 3 , 4 , 5 , 7 , 1 , 9 ]
    ch = [ 'Z' , 'X' , 'W' , 'G' , 'H' , 'R' , 'F' , 'V' , 'O' , 'E' ]
    word = [ 'ZERO' , 'SIX' , 'TWO' , 'EIGHT' , 'THREE' , 'FOUR' , 'FIVE' , 'SEVEN' , 'ONE' , 'NINE' ]
    for zz in range ( 1 , T + 1 ) :
        S = string.split ( string.ascii_letters ) [ 0 ]
        C = [ 0 ] * 26
        for letter in S :
            C [ ord ( letter ) - ord ( 'A' ) ] += 1
        ans = [ 0 ] * 10
        for letter in word :
            count = C [ ord ( letter ) - ord ( 'A' ) ]
            ans [ num [ letter ] ] += count
            for letter in word [ letter ] :
                C [ ord ( letter ) - ord ( 'A' ) ] -= count
        for letter in C :
            if letter in C :
                raise
        print ( 'Case #%d: ' % zz )
        for letter in C :
            for i in ans :
                print ( letter , end = ' ' )
            print ( )
