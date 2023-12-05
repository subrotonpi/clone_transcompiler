def _import ( ) :
    import os
    import sys
    import os
    import random
    import random
    import sys
    class D :
        SAMPLE = False
        PROBLEM = 'D'
        INPUT = 'large'
        ID = '0'
        PATH = r' F : \ software SPACETOKEN installation \ - commandline - 1.2 - beta1 \ source\ \'
        @ staticmethod
        def read ( f , size ) :
            f = open ( f , 'r' ) if SAMPLE else open ( f , 'r' )
            out = sys.stdout if SAMPLE else open ( f , 'w' )
            test = random.randint ( 1 , size )
            for t in range ( 1 , test + 1 ) :
                out.write ( 'Case #%d: ' % t )
                N = random.randint ( 1 , size )
                naomi , ken = read_messes ( f , N )
                naomi.sort ( )
                ken.sort ( )
                naomi_deeitful = play_deeitful ( ( naomi , ken ) )
                naomi_wing = play_war ( ( naomi , ken ) )
                out.write ( '%d %d\n' % ( naomi_deeitful , naomi_wing ) )
            out.close ( )
            f.close ( )
            print ( 'finish!' )
    def read_messes ( f , size ) :
        messes = [ ]
        for i in range ( size ) :
            messes.append ( f.read ( ) )
        return messes
    def play_war ( naomi , ken ) :
        naomi_deeitful = 0
        for i in naomi_messes :
            index_to_insert = - 1 - len ( list ( enumerate ( naomi_messes ) ) )
            if i == len ( ken ) :
                naomi_deeitful += 1
            else :
                naomi_deeitful += 1
        return naomi_deeitful
    return play_war
