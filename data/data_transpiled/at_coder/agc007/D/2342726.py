def _SegmentTreeRMQL ( ) :
    from os import getenv
    class SegmentTreeRMQL ( object ) :
        def __init__ ( self , n ) :
            self.N = n
            self.M = int ( max ( self.N - 1 , 1 ) ) << 2
            self.H = self.M >> 1
            self.st = [ ]
            self.st.insert ( 0 , self.M , long ( self.N ) )
        def lastle ( self , v ) :
            self.cur = self.N + 1
            self.N = self.N
            self.M = int ( max ( self.N - 1 , 1 ) ) << 2
            self.st = [ ]
            self.st.append ( self.st [ 0 ] )
            self.st.append ( self.st [ 0 ] )
            self.st.append ( self.st [ 1 ] )
            self.st.append ( self.st [ 1 ] )
            self.st.append ( self.st [ 2 ] )
            self.st.append ( self.st [ 2 ] )
            self.st.append ( self.st [ 3 ] )
            self.st.append ( self.st [ 4 ] )
            self.st.append ( self.st [ 5 ] )
            self.st.append ( self.st [ 6 ] )
            self.st.append ( self.st [ 7 ] )
            self.st.append ( self.st [ 8 ] )
            self.st.append ( self.st [ 9 ] )
            self.st.append ( self.st [ 10 ] )
            self.st.append ( self.st [ 11 ] )
            self.st.append ( self.st [ 12 ] )
            self.st.append ( self.st [ 13 ] )
            self.st.append ( self.st [ 14 ] )
            self.st.append ( self.st [ 13 ] )
            self.st.append ( self.st [ 14 ] )
            self.st.append ( self.st [ 15 ] )
            self.st.append ( self.st [ 16 ] )
            self.st.append ( self.st [ 17 ] )
            self.st.append ( self.st [ 18 ] )
            self.st.append ( self.st [ 18 ] )
