def import _recurse
class B ( object ) :
    def __init__ ( self , arg ) :
        self.M = [ ]
        self.PR = [ ]
        self.dp = [ ]
    def recurse ( self , index , start , finish , minus , lvl ) :
        with open ( self.M , 'r' ) as sc :
            self.TT = int ( sc.readline ( ) )
            for ii in range ( 1 , TT + 1 ) :
                P = sc.readline ( )
                M = [ sc.readline ( ) ]
                PR = [ [ ] for _ in range ( 1 , P + 1 ) ]
                for i in range ( 1 , P + 1 ) :
                    for j in range ( ( 1 , P - i ) ) :
                        PR [ i - 1 ].append ( sc.readline ( ) )
                ans = self.recurse ( 0 , 0 , ( 1 << P ) - 1 , 0 , P - 1 )
                print ( "Case #%d: %s\n" % ( ii , ans ) , end = "" )
    def recurse ( self , index , start , finish , minus , lvl ) :
        if lvl == - 1 : return 0
        canreduce = True
        for i in range ( start , finish + 1 ) :
            if M [ i ] - minus <= 0 :
                canreduce = False
        best = float ( "inf" )
        if canreduce :
            tmp = 0
            tmp += recurse ( self.index << 1 , start , ( start + finish ) // 2 , minus + 1 , lvl - 1 )
            tmp += recurse ( ( self.index << 1 ) + 1 , ( start + finish ) // 2 + 1 , finish , minus + 1 , lvl - 1 )
            if tmp < best : best = tmp
        tmp = self.PR [ lvl ] [ index ]
        tmp += recurse ( self.index << 1 , start , ( start + finish ) // 2 , minus , lvl - 1 )
        tmp += recurse ( self.index << 1 , start , ( start + finish ) // 2 + 1 , finish , minus , lvl - 1 )
        if tmp < best : best = tmp
        return best
