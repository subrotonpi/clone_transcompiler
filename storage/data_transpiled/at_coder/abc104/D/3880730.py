def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.S = sys.stdin.read ( )
    S = str ( S )
    S = S.reverse ( ).rstrip ( )
    T = S.split ( '' )
    C = 0
    BC = 0
    ABC = 0
    AB = 1
    X = 1
    for i in T :
        if i == '?' :
            ABC = ( ABC * 3 + BC ) % 1000000007
            BC = ( BC * 3 + C ) % 1000000007
            C = ( C * 3 + X ) % 1000000007
            X = ( X * 3 ) % 1000000007
        elif i == 'C' :
            AB = 0
            C += X
        elif i == 'B' :
            BC += C
        elif i == 'A' :
            ABC += BC
    print ( ABC % 1000000007 )
