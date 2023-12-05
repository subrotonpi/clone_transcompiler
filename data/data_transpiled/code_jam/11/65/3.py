def import readline , readline , sys , stdout , stderr , line , verbose , verbose , filename , verbose , ignore , warnings , ignore , warnings , ignore , warnings , stacklevel , warnings , stacklevel , warnings , ** kwargs ) :
    import readline
    import readline
    import time
    import random
    import locale
    import readline
    import readline
    import readline
    import readline
    import readline
    import time
    import random
    import locale
    import os
    import locale
    import readline
    import readline
    import time
    import time
    import random
    import time
    import time
    import locale
    import readline
    import time
    import time
    import time
    import random
    import locale
    import readline
    import time
    import time
    import time
    import time
    import time
    import time
    import locale
    import warnings , ignore , warnings , warnings , warnings
    warnings , warnings , ignore , warnings , warnings , warnings , ignore , warnings , warnings , warnings
    from threading import Thread
    import threading
    import time
    import time
    import time
    import random
    import locale
    import readline
    import time
    import time
    import warnings
    warnings.simplefilter ( 'error' )
    warnings.warn ( 'readline() is deprecated and use readline()' , DeprecationWarning )
    x = randint ( 1 , 2 )
    m = randint ( 1 , 3 )
    n = randint ( 1 , 4 )
    p = [ 1.] * n
    for it in range ( 100000 ) :
        for i in range ( n - 1 , - 1 , - 1 ) :
            for bet0 in range ( 1 , i + 1 ) :
                p1 , pcur = p [ i ] , 1.
                for bet in range ( bet0 , m ) :
                    loose = i - ( 2 * bet - bet0 )
                    win = i + bet0
                    pcur /= 2
                    p1 = max ( p1 , pcur * p [ max ( 0 , loose ) ] + ( 1.- pcur ) * p [ min ( n , win ) ] )
                p [ i ] = p1
    max_bet = 0
    for bet0 in range ( 1 , x + 1 ) :
        p1 , pcur = 0., 1.
        for bet in range ( bet0 , m + 1 ) :
            for win in range ( 1 , n + 1 ) :
                p1 = max ( p1 , pcur * p [