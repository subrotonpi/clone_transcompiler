def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.S = sys.stdin.read ( )
            self.T = sys.stdin.read ( )
    for i in range ( len ( S ) - len ( T ) , - 1 , - 1 ) :
        ok = True
        for j in range ( i , i + len ( T ) ) :
            if S [ j ] != T [ j - i ] and S [ j ] != '?' :
                ok = False
                break
        if ok :
            S = S [ : i ] + T + S [ i + len ( T ) : ]
            S = S.replace ( '?' , 'a' )
            print ( S )
            return
    print ( 'UNRESTORABLE' )
