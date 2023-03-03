def main ( ) :
    import sys
    class Main ( object ) :
        @ staticmethod
        def eval ( s ) :
            return s
    s = sys.stdin.read ( )
    ans = 0
    a = 0
    for i , c in enumerate ( s ) :
        if c == 'W' :
            ans += ( i - a )
            a += 1
    print ( ans )
