def _import ( ) :
    from itertools import chain
    from os import urandom
    from random import randint
    from itertools import chain
    from itertools import chain
    def check ( x ) :
        while x :
            a = x % 10
            z = [ ]
            while x :
                a = x % 10
                z.append ( True )
                x = x // 10
            return not z [ 0 ] and not z [ 1 ] and not z [ 2 ] and not z [ 3 ] and not z [ 4 ] and not z [ 5 ] and not z [ 6 ] and not z [ 7 ] and not z [ 8 ] and not z [ 9 ]
    def gen ( k ) :
        if k == 1 :
            yield 3
            yield 5
            yield 7
            return
        result = [ ]
        a = gen ( k - 1 )
        for b in a :
            result.append ( b * 10 + 3 )
            result.append ( b * 10 + 5 )
            result.append ( b * 10 + 7 )
        return result
    def gen2 ( k ) :
        result = [ ]
        for i in range ( 3 , k + 1 ) :
            result.extend ( gen ( i ) )
        return result
    def _main ( ) :
        with open ( "file.txt" , "r" ) as f :
            n = next ( f )
            ans = 0
            g = gen2 ( 9 )
            for x in g :
                if x > n :
                    break
                if check ( x ) :
                    ans += 1
            f.write ( ans )
            f.close ( )
    def _main ( ) :
        yield 1
    return _main
