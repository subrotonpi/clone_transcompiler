def _2016QualQA ( ) :
    import sys
    import os
    from .utils import _2016QualQA
    class _2016QualQA ( object ) :
        def __init__ ( self , filter = None ) :
            self.filter = filter
            self.online = True
            self.fname = 'A-large'
            if self.online :
                f = open ( os.path.join ( self.fname , 'in.txt' ) )
                w = open ( os.path.join ( self.fname , 'out.txt' ) , 'w' )
            else :
                f = open ( os.path.join ( self.fname , 'in.txt' ) )
                w = open ( os.path.join ( self.fname , 'out.txt' ) , 'w' )
            self.T = f.read ( 1 )
        def isSpaceChar ( self ) :
            if self.filter :
                return self.filter ( )
            return self.filter ( )
        def isSpaceChar ( self ) :
            return self.filter ( )
        def isSpaceChar ( self ) :
            return self.isSpaceChar ( )
    class _2016QualQA ( object ) :
        def __init__ ( self , filter = None ) :
            self.filter = filter
        def isSpaceChar ( self ) :
            return self.filter ( )
        def isSpaceChar ( self ) :
            return self.isSpaceChar ( )
        def isSpaceChar ( self ) :
            return self.isSpaceChar ( )
    class _2016QualQA ( object ) :
        def __init__ ( self , filter = None ) :
            self.filter = filter
        def isSpaceChar ( self ) :
            return self.isSpaceChar ( )
        def isSpaceChar ( self ) :
            return self.isSpaceChar ( )
    return _2016QualQA ( )
