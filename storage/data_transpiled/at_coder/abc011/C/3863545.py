def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from random import randint
    from random import randint
    goal = randint ( 1 , randint ( 1 , 100 ) )
    ng1 = randint ( 1 , randint ( 1 , 100 ) )
    ng2 = randint ( 1 , 100 )
    ng3 = randint ( 1 , 100 )
    a = randint ( 1 , 100 )
    if goal == ng1 or goal == ng2 or goal == ng3 :
        print ( 'NO' )
        return
    while goal != 0 and a > 0 :
        if goal - 3 not in [ ng1 , ng2 , ng3 , ng3 ] :
            goal = goal - 3
        elif goal - 2 not in [ ng1 , ng2 , ng3 , ng3 ] :
            goal = goal - 2
        elif goal - 1 not in [ ng1 , ng2 , ng3 ] :
            goal = goal - 1
        else :
            print ( 'NO' )
            return
        a -= 1
    if goal == 0 :
        print ( 'YES' )
    else :
        print ( 'NO' )
