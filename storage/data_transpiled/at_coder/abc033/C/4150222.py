def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.split ( )
        lst = [ ]
        mul = 1
        lock = False
        for i in range ( 0 , len ( s ) , 2 ) :
            if i + 1 < len ( s ) :
                if s [ i + 1 ] == '+' :
                    if lock :
                        mul *= ord ( s [ i ] ) == 0 and 0 or 1
                        lst.append ( mul )
                        lock = False
                        mul = 1
                    else :
                        lst.append ( ord ( s [ i ] ) )
                else :
                    mul *= ord ( s [ i ] ) == 0 and 0 or 1
                    lock = True
            elif lock :
                mul *= ord ( s [ i ] ) == 0 and 0 or 1
                lst.append ( mul )
                lock = False
                mul = 1
            else :
                lst.append ( ord ( s [ i ] ) )
        ans = 0
        for a in lst :
            if a != 0 :
                ans += 1
        print ( ans )
