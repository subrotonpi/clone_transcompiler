def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_COMPILED
    class Main ( object ) :
        def __init__ ( self ) :
            self.__dict__ = sys.__dict__
        def __getattr__ ( self , name ) :
            return getattr ( self.__dict__ , name )
        def __repr__ ( self ) :
            return '%s(%s)' % ( self.__class__.__name__ , ', '.join ( '%s(%s)' % ( self.__class__.__name__ , name ) for name in name.split ( '.' ) ) )
        def __call__ ( self , * args , ** kwargs ) :
            return '%s(%s)' % ( self.__class__.__name__ , ', '.join ( '%s(%s)' % ( self.__class__.__name__ , self.args [ 0 ] ) for self in args ) )
    return Main ( )
