def main ( ) :
    import math
    from os.path import join
    from math import ceil
    from os.path import join
    from os import path
    from os.path import join
    from os import path
    n = int ( join ( path , '--' , '.' , '--' ) )
    a = open ( join ( path , '--' , '.' ) ).read ( ).split ( )
    path = join ( path , '--' , '--' )
    have_bug = 0
    sum_bug = 0
    for bug_num_str in a :
        bug_num = int ( bug_num_str )
        if bug_num != 0 :
            have_bug += 1
            sum_bug += bug_num
    avg = sum_bug / have_bug
    avg_ceiled = int ( ceil ( avg ) )
    print ( avg_ceiled )
