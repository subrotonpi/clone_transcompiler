def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( sys.stdin.readline ( ).strip ( ) )
    A = [ ]
    ans = 0
    flag = True
    for i in range ( n ) :
        A.append ( int ( sys.stdin.readline ( ).strip ( ) ) )
    while flag :
        for i in range ( n ) :
            if A [ i ] % 2 == 0 :
                A [ i ] /= 2
            else :
                flag = False
        if flag :
            ans += 1
    sys.stdout.write ( ans )
