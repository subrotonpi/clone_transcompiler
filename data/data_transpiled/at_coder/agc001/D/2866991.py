def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.odd = [ ]
        self.even = [ ]
        for i in range ( self.M ) :
            a = sys.stdin.read ( )
            if a % 2 == 0 :
                self.even.append ( a )
            else :
                self.odd.append ( a )
        if len ( self.odd ) > 2 :
            print ( "Impossible" )
            return
    ans = [ ]
    if len ( self.odd ) >= 1 :
        d = self.odd.pop ( 0 )
        print ( d , end = " " )
        while d > 1 :
            ans.append ( 2 )
            d -= 2
    else :
        d = self.even.pop ( 0 )
        print ( d , end = " " )
        ans.append ( d - 1 )
    for i in self.even :
        ans.append ( i )
        print ( i , end = " " )
    if len ( self.odd ) >= 1 :
        d = self.odd.pop ( 0 )
        print ( d , end = " " )
        while d > 0 :
            ans.append ( 2 )
            d -= 2
    else :
        ans.append ( 1 )
    print ( )
    print ( len ( self.ans ) )
    for i in self.ans :
        print ( i , end = " " )
    print ( )
