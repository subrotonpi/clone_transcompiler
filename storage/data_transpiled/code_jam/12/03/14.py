def py2012qualifier ( ) :
    import os
    import math
    import os
    import math
    import math
    import math
    import os
    import math
    import math
    import os
    import sys
    import os
    import math
    import math
    import math
    import math
    import os
    import sys
    class C :
        def __init__ ( self ) :
            self.input_directory = os.path.dirname ( os.path.realpath ( __file__ ) )
            self.input_file = os.path.join ( self.input_directory , self.input_file )
            self.output_file = os.path.join ( self.input_directory , self.output_file )
            self.output = open ( os.path.realpath ( __file__ ) , 'w' )
            cases = self.input.count ( )
            for Case in range ( 1 , cases + 1 ) :
                self.output.write ( "%s\n" % ( self.input.count ( ) ) )
    def count ( n , max ) :
        digit = 10
        pow10 = 10 ** int ( math.pow ( 10 , math.floor ( math.log10 ( n ) ) ) )
        count = 0
        found = set ( )
        while digit <= n :
            m = n // digit + ( n % digit ) * pow10 // digit
            digit *= 10
            if m > n and m <= max and m not in found :
                count += 1
                found.add ( m )
        return count
    def out ( s ) :
        output.write ( s )
