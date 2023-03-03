def _import ( ) :
    import sys
    import string
    import sys
    import getopt
    class Main ( object ) :
        def __init__ ( self , * args ) :
            self.N = len ( args )
        def __init__ ( self , * args ) :
            sc = getopt.getopt ( args , "" )
            self.N = len ( sc )
            self.S = sc.next ( )
            self.T = sc.next ( )
            print ( self.solve ( ) )
        def lower_bound ( self , value ) :
            lo , hi = 0 , len ( self.S )
            if self.S [ self.N - 1 ] < value :
                self.S = self.S [ self.N - 1 ]
            else :
                self.S = self.S [ self.N - 1 ]
            return self.S [ self.N - 1 ]
        def upper_bound ( self , value ) :
            lo , hi = 0 , len ( self.S )
            while lo < hi :
                mid = ( hi + lo ) // 2
                if self.S [ mid ] <= value :
                    self.S = self.S [ mid ]
                else :
                    self.S = self.S [ mid ]
            return self.S [ mid ]
        def readline ( self ) :
            if self.S is None or not self.S :
                try :
                    self.S = self.S.readline ( )
                except EOFError :
                    self.S = self.S.readline ( )
            return self.S [ mid ]
        def readline ( self ) :
            if self.S is None or not self.S :
                try :
                    self.S = self.S.readline ( )
                except EOFError :
                    self.S = self.S.readline ( )
            return self.S [ mid ]
        def readline ( self ) :
            if self.S is None or not self.S :
                try :
                    self.S = self.S.readline ( )
                except EOFError :
                    self.S = self.S.readline ( )
            return self.S [ mid ]
