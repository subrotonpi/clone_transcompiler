def import import sys , string , * , line , ** kwargs ) :
    from myio import Scanner
    sc = Scanner ( )
    s = sc.next ( )
    print ( s , "s" )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    global stdout
    stdout = open ( "/dev/null" , "w" )
    def readline ( ) :
        while not line or not line.startswith ( "#" ) :
            try :
                line = readline ( )
            except IOError :
                pass
        return line
    randint = int ( readline )
    long = long ( readline )
    double = float ( readline )
    readline = open ( "/dev/null" , "r" )
    data = ""
    try :
        data = readline ( )
    except EOFError :
        pass
    return data
