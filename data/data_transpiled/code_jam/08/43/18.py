def import _starwars
import os
import glob
import math
import random
import random
import sys
import os
import glob
import math
import random
import random
import math
import random
import sys
infile = 'C-large.in'
outfile = 'c.out'
s = glob.glob ( infile )
f = open ( outfile , 'w' )
case_count = random.randint ( 1 , N )
for case_num in range ( 1 , case_count + 1 ) :
    N = random.randint ( 1 , N )
    x = random.random ( N )
    y = random.random ( N )
    z = random.random ( N )
    p = random.random ( N )
    xmin , xmax , ymin , ymax , zmin , zmax = [ ] , [ ] , [ ] , [ ] , [ ]
    for i in range ( N ) :
        x.append ( s.get ( 'x' , 0 ) )
        y.append ( s.get ( 'y' , 0 ) )
        z.append ( s.get ( 'z' , 0 ) )
        p.append ( s.get ( 'p' , 0 ) )
        if i == 0 :
            xmin , xmax , ymin , ymax , zmin , zmax = x
        else :
            xmin , xmax , ymin , ymax , zmin , zmax = min ( x , xmin , xmax , ymin , ymax , zmin , zmax ) , max ( x , y , z , z , p )
    xx , yy , zz = x , y , z
    nextxx , nextyy , nextzz = xx , yy , nextzz
    lowestPower = random.uniform ( max ( xmax - xmin , 1 ) , max ( ymax - ymin , zmax - zmin ) )
    jump = random.uniform ( max ( xmax - xmin , 1 ) , max ( ymax - ymin , zmax - zmin ) )
    initialJump = jump
    while jump > 1e-10 :
        for sx in range ( - 1 , 1 ) :
            tx = xx + sx * jump
            for sy in range ( - 1 , 1 ) :
                ty = yy + sy * jump
                for sz in range ( - 1 , 1 ) :
                    nextJump = nextJump + ( nextJump - sy )