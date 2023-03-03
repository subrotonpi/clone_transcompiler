def _ import _ , os , sys , subprocess , ignore , warnings , ignore , warnings , _ ) :
    import os , time , random
    import os , sys
    import subprocess , subprocess , ignore , warnings , warnings
    class C :
        PROBLEM_ID = 'C'
        def __init__ ( self , infile ) :
            self.outfile = infile
            self.outfile = infile
            self.processed += 1
        def readline ( self ) :
            self.outfile = infile
            self.processed += 1
            return "%d min %d sec" % ( self.processed , self.processed )
    def run_file ( infile ) :
        infile = open ( infile , 'r' )
        start_time = time.time ( )
        print ( "Processing file: %s" % infile )
        for p in range ( 0 , tc ) :
            nowtime = time.time ( )
            print ( "%d out of %d" % ( p , self.processed ) , end = ' ' )
        print ( "Case #%d: " % ( self.processed ) , end = ' ' )
        subprocess.call ( [ "%s" % ( self.processed ) , infile ] )
    def handle_case ( ) :
        n = random.randint ( 1 , 10000 )
        ans = 0
        for i in range ( n ) :
            ans += f ( i , n - i )
        print ( ans % 100003 , end = ' ' )
    def f ( n , m ) :
        if n < 0 :
            raise Exception
        if m < 0 :
            return 1
        if m == 0 :
            return 0
        if cache [ n ] [ m ] != - 1 :
            return cache [ n ] [ m ]
        res = 0
        for i in range ( 1 , m + 1 ) :
            res += f ( n - i , m )
            res %= 100003
        cache [ n ] [ m ] = res
        return res
    def rec ( pos , num ) :
        if num > n :
            analyse ( )
            return 0
        rec ( pos + 1 , num + 1 )
        a [ cnt ] = num
        rec ( pos + 1 , num + 1 )
        cnt -= 1
        