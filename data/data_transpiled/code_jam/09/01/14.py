def _import ( ) :
    from itertools import count , repeat
    class A ( object ) :
        def __init__ ( self ) :
            self.A = A
        def __call__ ( self , * args , ** kwargs ) :
            with open ( self.A , 'r' ) as f :
                L , D , N = map ( int , f.read ( ).split ( ',' ) )
                dictionary = [ re.sub ( r'[^a-zA-Z0-9_]' , r'\1[^a-zA-Z0-9_]' , f.read ( ).split ( ',' ) ) for f in f.readlines ( ) ]
                for cases in range ( 1 , N + 1 ) :
                    result = 0
                    pattern = re.sub ( r'([^a-zA-Z0-9_])' , r'\1[^a-zA-Z0-9_]' , pattern )
                    pattern = pattern.replace ( '(','[' )
                    pattern = pattern.replace ( ')',']' )
                    for case in range ( D ) :
                        if re.match ( pattern , case ) :
                            result += 1
                    print ( 'Case #%d: %d' % ( cases , result ) )
    return A
