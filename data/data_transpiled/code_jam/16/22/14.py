def import _main
class Main ( object ) :
    def matches ( self , a , b ) :
        if a == '?' or b == '?' : return True
        return a == b
    def fill ( self , s ) :
        ans = 0
        for c in s :
            ans = ans * 10
            if c == '?' : ans += c
            else : ans += ( c - '0' )
        return ans
    def solve ( self ) :
        with open ( 'input.txt' , 'r' ) as f :
            ntc = len ( f.read ( ) )
            for test in range ( 1 , ntc + 1 ) :
                a = f.read ( )
                b = f.read ( )
                n = len ( a )
                list_a = [ ]
                list_b = [ ]
                for i in range ( n ) :
                    old_a , old_b = a , b
                    for d in range ( 10 ) :
                        if a [ i ] == '?' : a [ i ] = ord ( '0' ) + ord ( d )
                        if b [ i ] == '?' : b [ i ] = ord ( '0' ) + ord ( d )
                        for d2 in range ( 10 ) :
                            list_a.append ( fill ( a , d2 ) )
                            list_b.append ( fill ( b , d2 ) )
                        a [ i ] = old_a
                        b [ i ] = old_b
                    if a [ i ] == '?' and b [ i ] == '?' : a [ i ] = b [ i ] = '0'
                    elif a [ i ] == '?' : a [ i ] = b [ i ]
                    elif b [ i ] == '?' : b [ i ] = a [ i ]
                list_a.sort ( )
                list_b.sort ( )
                best_a , best_b = max ( list_a ) , max ( list_b )
                if abs ( i - j ) < abs ( best_a - best_b ) :
                    best_a = i
                    best_b = j
        return None
    return Main ( )
