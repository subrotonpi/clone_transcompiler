def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            A = self.scn.read ( )
            B = self.scn.read ( )
    ans = 0
    DT = abs ( A - B )
    ans += DT / 10
    DT %= 10
    if DT < 4 :
        ans += DT
    elif DT > 7 :
        ans += 1
        ans += 10 - DT
    else :
        ans += 1
        ans += abs ( DT - 5 )
    print ( ans )
