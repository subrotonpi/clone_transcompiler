def _ _ import _ _ ; SPACETOKEN print ( p ( * args ) ) :
    import math
    import random
    import sys
    class A :
        def __init__ ( self , * args ) :
            print ( " ".join ( map ( str , args ) ) )
    class B :
        def __init__ ( self , * args ) :
            self.max , self.fix , self.variable = args
    class A ( object ) :
        def __init__ ( self , * args ) :
            self.max , self.variable = args
    class B ( A ) :
        def __init__ ( self , * args ) :
            self.max , self.fix , self.variable = args
    return B
