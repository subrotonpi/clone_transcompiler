def round_1B_2010 ( ) :
    import os
    import math
    import random
    import math
    import os
    import math
    import math
    import os
    import sys
    class LoadTestingR ( object ) :
        def __init__ ( self ) :
            self.raw_input = raw_input
        def raw_input ( self ) :
            return
    with open ( os.path.expanduser ( '~/.ltrout_large.txt' ) , 'w' ) as f :
        t = random.randint ( 1 , 4 )
        for cc in range ( 1 , t + 1 ) :
            l = random.randint ( 1 , 4 )
            p = random.randint ( 1 , 4 )
            c = random.randint ( 1 , 4 )
            sum = 0
            now = p
            if l * c >= p :
                f.write ( 'Case #{}: 0\r\n'.format ( cc ) )
            else :
                while True :
                    sum += 1
                    now = ( now + c - 1 ) / c
                    if l * c >= now :
                        break
                result = int ( math.ceil ( math.log ( sum + 1 ) / math.log ( 2 ) ) )
                f.write ( 'Case #{}: {}\r\n'.format ( cc , result ) )
            f.flush ( )
