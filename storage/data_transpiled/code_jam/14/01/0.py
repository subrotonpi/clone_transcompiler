def main ( ) :
    import sys
    class a ( object ) :
        def __init__ ( self ) :
            self.T = int ( sys.stdin.readline ( ).strip ( ) )
    for t in range ( 1 , T + 1 ) :
        n = int ( t ) - 1
        set1 , set2 = set ( ) , set ( )
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                if i == n :
                    set1.add ( i )
                else :
                    self.add ( i )
        m = int ( t ) - 1
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                if i == m :
                    set2.add ( i )
                else :
                    self.add ( i )
            set1.retainAll ( set2 )
            print ( "Case #%d: " % t )
            ans = 0
            for x in set1 :
                ans = x
            if len ( set1 ) == 0 :
                print ( "Volunteer cheated!" )
            elif len ( set1 ) > 1 :
                print ( "Bad magician!" )
            else :
                print ( ans )
