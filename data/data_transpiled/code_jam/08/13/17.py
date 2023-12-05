def import import os , sys , random , randrange , random , symbols , string , decimal , symbols , count , symbol , filename , ** kwargs ) :
    from decimal import Decimal
    import random
    import os
    import locale
    import math
    import random
    import locale
    try :
        locale.setlocale ( locale.LC_ALL , '' )
        f = open ( FILENAME + '.in' , 'r' )
        out = open ( FILENAME + '.out' , 'w' )
        solve ( )
        out.close ( )
    except IOError :
        pass
    else :
        while not words or not words [ 0 ] :
            try :
                words = random.choice ( string.ascii_lowercase )
            except :
                eof = True
                return '0'
        return words [ 1 ]
    def randint ( ) :
        return int ( random.randint ( 1 , 10000 ) )
    def uniform ( ) :
        return float ( random.uniform ( 1 , 10000 ) )
    FILENAME = 'C-small'
    answ = ( 005 , 027 , 143 , 751 , 935 , 607 , 903 , 991 , 335 , 047 , 943 , 471 , 055 , 447 , 463 , 991 , 95 , 607 , 264 , 151 , 855 , 527 , 743 , 351 , 135 , 407 , 903 , 791 , 135 , 647 )
    def solve ( ) :
        testsn = random.randint ( 1 , 10000 )
        for test in range ( testsn ) :
            out.write ( 'Case #%d: ' % ( test + 1 ) )
            n = randint ( 1 , 10000 )
            a = 3 + random.randrange ( 5 )
            ab = Decimal ( '5.236067977499789696409173668731276235440618359611525724270897245410520925638' )
            ans = random.choice ( answ )
            for i in range ( n ) :
                ans = ans * ab
            s = ans.ljust ( a , '0' )
            p = s.find ( '.' )
            r = s [ max ( 0 , p - 3 ) : p ]
            while len ( r ) < 3 :
                r = '0' + r
            out.