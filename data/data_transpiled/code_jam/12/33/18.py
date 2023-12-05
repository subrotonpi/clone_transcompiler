def round1c ( ) :
    import os
    import sys
    class C_BoxFactory ( object ) :
        ID = "C"
        NAME = "large"
        STANDARD_OUTPUT = False
        def main ( self ) :
            f = open ( os.path.join ( "data/" , ID , "%s.in" % NAME ) , "r" )
            if not isinstance ( self , State ) : return False
            st1 , st2 = self.state , self.state
            if self.i == st2.i and self.j == st2.last_i and self.last_j == st2.last_j :
                c = self.last_i - self.last_j
                best = max ( best , dp ( self.i , self.j , 0 , self.last_j ) + c )
            else :
                c = self.last_j - self.last_i
                best = max ( best , dp ( self.i , self.j , self.last_i , self.last_j ) + c )
    class State ( object ) :
        def __init__ ( self , i , j , last_i , last_j ) :
            self.i , self.j = i , j
            self.last_i , self.last_j = last_i , last_j
        def __eq__ ( self , object ) :
            if not isinstance ( object , State ) : return False
            st1 , st2 = self.state , self.state
            self.last_i , self.last_j = self.last_j , self.last_i
            return self.last_i , self.last_j
        def __hash__ ( self ) :
            return int ( self.i ^ self.last_j ) , self.last_i
    class A ( object ) :
        def __init__ ( self , i , j , last_i , last_j ) :
            self.i , self.j = i , j , self.last_i , self.last_j
    class B ( object ) :
        def __init__ ( self , i , j , last_j ) :
            self.i , self.j = i , j , self.last_j
    A = A ( )
    B = B ( )
    B = B ( )
    print ( "Case #%d: %d" % ( c , dp ( self.i , self.j ,