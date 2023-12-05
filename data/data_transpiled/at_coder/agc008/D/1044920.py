def _ _ main _ _ ( ) : return sys.stdout
import time
import sys
import os
import sys
import math
import time
import sys
import math
import sys
import os
import os
import sys
import os
import time
import math
import time
import math
import time
import sys
import sys
import os
import os
import os
import sys
import os
import os
import time
import time
import time
import math
import math
import time
import time
import time
import sys
import sys
import stdin = sys
try :
    if os.environ.has_key ( '_LOCAL_' ) :
        stdin = sys.stdin
    else :
        stdin = sys.stdin
except Exception :
    pass
def solve ( ) :
    n = input ( )
    x = [ ]
    for i in range ( n ) :
        x.append ( input ( ) )
    try :
        while not os.environ.has_key ( '_LOCAL_' ) :
            token = raw_input ( )
    except Exception :
        pass
    else :
        return token
    v = sorted ( x , key = lambda x : int ( x [ 0 ] ) )
    for j , i in v :
        cnt = i
        for k in x [ j ] and cnt :
            if res [ k ] == 0 :
                res [ k ] = i + 1
                cnt -= 1
        if cnt > 0 :
            print ( 'No' , end = '' )
            return
    v = sorted ( x , key = lambda x : int ( x [ 1 ] ) )
    for j , i in v :
        cnt = n - i - 1
        for k in x [ j ] and cnt :
            if res [ k ] == 0 :
                res [ k ] = i + 1
                cnt -= 1
        if cnt > 0 :
            print ( 'Yes' , end = '' )
            return
    print ( 'No' , end = '' )
    for i in range ( n * n ) :
        print ( '%d' % ( i + 1 ) , end = '' )
    print ( '\nTime elapsed: %.4f' % ( time.time (