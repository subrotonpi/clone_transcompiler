def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
            self.s = sys.stdin.read ( )
            self.s = sys.stdin.read ( )
            self.n = len ( self.s )
    ans = 0
    haszero = False
    if n == 1 :
        if self.s [ 0 ] == '0' :
            print ( 0 )
        else :
            print ( 1 )
        return
    for i , c in enumerate ( s ) :
        if i == n - 1 :
            if self.s [ i - 1 ] == '+' :
                if c != '0' :
                    ans += 1
            else :
                if c == '0' :
                    haszero = True
                if haszero :
                    pass
                else :
                    ans += 1
            break
        if i % 2 == 0 :
            if c == '0' :
                haszero = True
            else :
                pass
        else :
            if c == '+' :
                if haszero :
                    haszero = False
                else :
                    ans += 1
            else :
                pass
    print ( ans )
