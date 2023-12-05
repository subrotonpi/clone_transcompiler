def import _import_d
class D ( object ) :
    def __init__ ( self , * args ) :
        self.dp = [ False ] * 1
        self.keys = [ ]
        self.st = [ ]
        self.ans = ''
        self.K , self.N = self.N , self.N
        self.con = [ ]
        self.type = [ ]
    def f ( self , mask ) :
        Scanner ( ).next ( )
        self.T = int ( self.T )
        for ca in range ( 1 , T + 1 ) :
            K , N = self.K , self.N
            self.dp = [ False ] * 1
            self.keys = [ 201 ] * 1
            self.st = [ ]
            self.ans = None
            self.con = [ ]
            self.type = [ ]
            for i in range ( K ) :
                self.keys [ self.K ] += 1
            for i in range ( N ) :
                self.type.append ( self.type [ i ] )
                k = self.N
                self.con.append ( [ k ] )
            self.f ( 0 )
            print ( 'Case #%d:' % ( ca , ' IMPOSSIBLE' if ans is None else ans ) )
    def f ( self , mask ) :
        if self.dp [ mask ] :
            return
        if self.ans :
            return
        if mask == ( 1 << self.N ) - 1 :
            ans = ''
            while not self.st.empty ( ) :
                ans = ' ' + self.st.pop ( ) + ans
            self.dp [ mask ] = True
            return
        for i in range ( self.N ) :
            if not self.keys [ self.type [ i ] ] :
                continue
            if self.mask & ( 1 << i ) :
                continue
            self.keys [ self.type [ i ] ] -= 1
            self.st.append ( i + 1 )
            newmask = mask | ( 1 << i )
            for j in self.con :
                self.keys [ self.type [ j ] ] += 1
            self.f ( newmask )
            self.keys [ self.type [ i