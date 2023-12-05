def main ( ) :
    import sys
    import getopt
    try :
        opts , args = getopt.getopt ( sys.argv [ 1 : ] , "r" )
    except getopt.error as msg :
        print ( msg )
        return
    for o , a in opts :
        if o == "-r" :
            h , w = 1 , 2
        elif o == "-w" :
            w = 1 , 2
        elif o == "-r" :
            h , w = 1 , 2
        elif o == "-r" :
            h , w = 1 , 2
        elif o == "-r" :
            h , w = 1 , 2
        elif o == "-s" :
            s , w = 1 , 1
        elif o == "-t" :
            if w == 1 :
                w = 1
        elif o == "-r" :
            h = 0
        elif o == "-s" :
            h = 1
        elif o == "-t" :
            if w == 1 :
                w = 0
        elif o == "-r" :
            h = 1
