def import import sys , StringIO , recwarn , importorskip , filestore , rename = lambda x : x.endswith ( '.py' ) ) :
    from numpy import abs
    from numpy.distutils.misc_util import Configuration
    from scipy.sparse import csc_matrix , get_blas_info
    try :
        from scipy.sparse import csr_matrix , linalg , rsvd
    except ImportError :
        import numpy.distutils.misc_util
        # it is easy to do this with a local copy
    try :
        from scipy.sparse import csc_matrix as csc_matrix
    except ImportError :
        import scipy.sparse
    N = len ( sys.modules [ 'scipy.sparse' ].__path__ [ 0 ] )
    M = len ( sys.modules [ 'scipy.sparse' ].__code__ )
    c = csc_matrix ( N )
    B = csc_matrix ( M )
    A = csc_matrix ( N )
    sum = [ 0 ] * N
    k = 0
    for i in range ( N ) :
        B [ i ] = csc_matrix ( B [ i ] )
    for i in range ( N ) :
        for j in range ( M ) :
            A [ i ] [ j ] = random.random ( ) * B [ j ]
        sum [ i ] += c
    f = open ( 'test.txt' , 'w' )
    for i in range ( N ) :
        if sum [ i ] > 0 :
            k += 1
    print ( k )
    class fast_reader ( object ) :
        def __init__ ( self ) :
            self.__dict__ = { }
            self.__reader__ = recwarn
            self.__reader__ = recwarn
        def readline ( self ) :
            while not self.__reader__ or not self.__reader__ :
                try :
                    self.__reader__ = recwarn
                except IOError :
                    pass
            return self.__reader__ = recwarn
    return fast_reader
