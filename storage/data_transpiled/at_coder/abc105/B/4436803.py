def import import sys , StringIO , recarray , recarray , rename = recarray , dtype = None ) :
    from numpy.core import dtype
    from numpy.random import randint
    from numpy.core import rand
    from numpy.core import zeros , float64
    from numpy.random import rand
    from numpy.core import copy_to_space
    from numpy.random import rand
    N = rand ( 10 , N )
    max4 = N // 4
    max7 = N // 7
    if N == max4 :
        N = rand ( 10 , N )
    else :
        N = N
    if N == max7 :
        N = rand ( 10 , N )
    else :
        N = rand ( 10 , N )
    if N == max4 :
        for i4 in range ( 0 , N ) :
            for i7 in range ( 0 , N ) :
                total = i4 * 4 + i7 * 7
                if total == N :
                    N += 1
        if N != max7 :
            print ( 'Yes' )
        else :
            print ( 'No' )
    class recarray ( object ) :
        def __init__ ( self , dtype = dtype , count = None , rsize = None ) :
            self.dtype = dtype
            self.count = count
        def readline ( self ) :
            if not count or not rsize :
                try :
                    return self.dtype.type ( self.count )
                except AttributeError :
                    pass
            return self.dtype.type ( self.count )
        def write ( self , out ) :
            if not count :
                self.dtype = dtype
            return out
    recarray.__init__ ( recarray )
    return recarray
