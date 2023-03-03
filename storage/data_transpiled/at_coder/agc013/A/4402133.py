def import import sys , string , count , cut , inc , out
from itertools import repeat
from itertools import chain
from random import randint
from itertools import islice
from itertools import chain
n = int ( sys.stdin.readline ( ) )
a = range ( n )
count = 0
cut = True
inc = 0
out :
    for i in chain ( a , repeat ( n ) ) :
        if cut :
            if i == n - 1 or i == n - 2 :
                count += 1
                break
            if a [ i + 1 ] - a [ i ] > 0 :
                inc = 1
                cut = False
            elif a [ i + 1 ] - a [ i ] < 0 :
                inc = - 1
                cut = False
            else :
                inc = 0
        else :
            if inc == 1 :
                if a [ i + 1 ] - a [ i ] < 0 :
                    count += 1
                    cut = True
                elif i == n - 2 :
                    count += 1
                    break
            elif inc == - 1 :
                if a [ i + 1 ] - a [ i ] > 0 :
                    count += 1
                    cut = True
                elif i == n - 2 :
                    count += 1
                    break
            else :
                if i == n - 2 :
                    count += 1
                    break
    print ( count )
