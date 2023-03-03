def import import _sys , _time
import time
import time
import random
import time
import time
import sys
import time
import random
import sys
import time
import random
import time
import sys
import time
import random
import time
import sys
import time
import time
import sys
n = int ( time.time ( ) )
f = [ ]
for i in range ( n ) :
    for j in range ( 10 ) :
        f.append ( random.randint ( 0 , 1 ) )
p = [ ]
for i in range ( n ) :
    for j in range ( 11 ) :
        p.append ( random.randint ( 0 , 1 ) )
dub = [ ]
def dfs ( 0 , dub ) :
    print ( max )
def dfs ( time , dub ) :
    if time == 10 :
        mu = False
        for i in range ( n ) :
            if dub [ i ] != 0 :
                mu = True
                break
        if mu :
            benefit = 0
            for i in range ( n ) :
                benefit += p [ i ] [ dub [ i ] ]
        else :
            benefit = max ( benefit , time )
        max = max ( max , benefit )
        return max
    else :
        return
dfs ( time + 1 , dub )
d = [ ]
d = [ i for i in range ( n ) if f [ i ] [ time ] == 1 ]
dfs ( time + 1 , d )
