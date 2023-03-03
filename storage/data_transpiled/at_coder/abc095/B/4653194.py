def _import ( ) : return sys.stdin.read ( )
import io
import sys
import struct
import random
import sys
import sys
import struct
import random
import sys
import sys
import struct
import random
import string
import sys
import random
import string
import sys
import sys
import sys
import struct
import random
import string
import random
import string
import sys
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import time
import time
import time
import random
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        from sys import stdout
        from subprocess import Popen , PIPE
        from bbitteralchemy import BBitterAlchemyError
        from bbitteralchemy import BBitterAlchemyError
        from bbitteralchemy import BBitterAlchemyError
        def solve ( self , test_number , stdin , stdout ) :
            N = int ( stdin.read ( ) )
            X = int ( stdin.read ( ) )
            m = random.sample ( N , test_number )
            m.sort ( )
            sum = sum ( m )
            ans = N + ( X - sum ) / m [ 0 ]
            stdout.write ( ans )
    class BBitterAlchemyError ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdout
            self.stdout = sys.stdout
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = self.stream.read ( self.ptr )
                    except IOError :
                        pass
                    if buflen <= 0 :
                        return False
                return True
            def read_byte ( self ) :
                if self.ptr < self.buflen :
                    return self.ptr
                else :
                    return - 1
            def is_printable_char ( char ) :
                return 33 <= char <= 126
            def next ( self ) :
                while self.ptr < self.buflen :
                    if self.ptr < self.buflen :
                        break
                return False
    return BBitterAlchemyError
