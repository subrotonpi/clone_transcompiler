def gcj2009 ( ) :
    import os
    import time
    import datetime
    import os
    import re
    import time
    import time
    import re
    class A_Alien_Language ( object ) :
        SMALL = False
        PROBLEM = 'A'
        def __init__ ( self , filename ) :
            self.filename = filename
            self.filename = filename
            self.L , D , N = self.L , self.D , self.N
            self.dictionary = [ s.split ( '.' ) for s in self.dictionary ]
            print ( '%d test cases:' % N )
            start , t1 , left = time.time ( ) , t1 , 0
            for CASE in range ( 1 , N + 1 ) :
                t1 = time.time ( )
                print ( '%d.[%s] ' % ( CASE , datetime.datetime.fromtimestamp ( t1 ).strftime ( '%H:%M:%S.%f' ) ) , end = '' )
                pattern = self.pattern.replace ( '(' , '[' ).replace ( ')' , ']' )
                p = re.compile ( pattern )
                cnt = 0
                for i in range ( D ) :
                    if p.match ( i ) : cnt += 1
                res = str ( cnt )
                print ( 'Case #%d: %s' % ( CASE , res ) , end = '' )
                left = ( time.time ( ) - start ) * ( N - CASE ) / CASE
                print ( '%s (%dms, ~%dms left)' % ( res , ( time.time ( ) - t1 ) , left ) , end = '' )
