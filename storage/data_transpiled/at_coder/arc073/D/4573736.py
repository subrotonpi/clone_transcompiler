def _import ( ) :
    from os import urandom
    class SegmentTreeRMQL ( object ) :
        def __init__ ( self , n ) :
            self.N = n
            self.M = int ( max ( self.N - 1 , 1 ) ) << 2
            self.H = self.M >> 1
            self.st = [ ]
            self.st.append ( self.st [ 0 ] )
            self.st.append ( self.st [ - 1 ] )
            self.st.append ( self.st [ - 1 ] )
            self.st.append ( self.st [ - 1 ] )
            self.st.append ( self.st [ - 1 ] )
        def _readline ( self ) :
            self.N = len ( self.st )
            self.M = int ( max ( self.N - 1 , 1 ) ) << 2
            self.H = self.M >> 1
            self.st = [ ]
            for i in range ( self.N ) :
                self.st.append ( self.st [ i ] )
            self.st.append ( self.st [ H + self.N ] )
            self.st.append ( self.st [ H + self.N ] )
            self.st.append ( self.st [ H + self.N ] )
            self.st.append ( self.st [ H + self.N ] )
            self.st.append ( self.st [ H + self.N ] )
            for i in range ( self.N ) :
                self.st [ i ] = self.st [ 2 * i ]
        def _readline ( self ) :
            self.st = [ ]
            self.st.append ( self.st [ 2 * i ] )
            self.st.append ( self.st [ 2 * i ] )
        def _eval ( self , self ) :
            self.st = [ ]
            self.st = [ ]
            self.st.append ( self.st [ 0 ] )
            self.st.append ( self.st [ 1 ] )
            self.st.append ( self.st [ 2 * i ] )
        def _eval ( self , self ) :
            self.st = [ ]
            self.st.append ( self.st [ 2 * i ] )
        