def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.k = self.sc.readline ( ).strip ( )
    ans = 0
    for i in range ( 1 , k ) :
        for j in range ( i + 1 , k + 1 ) :
            if i % 2 != j % 2 :
                ans += 1
    sys.stdout.write ( ans )
