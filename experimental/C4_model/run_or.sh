output=test 
lr=5e-5
batch_size=4
source_length=64
data_dir=./
output_dir=model/$output
train_file=./dataset_paper/pair_train.jsonl
dev_file=./dataset_paper/pair_valid.jsonl
test_file=./dataset_paper/pair_test.jsonl
epochs=1
pretrained_model=microsoft/codebert-base #Roberta: roberta-base 

python3 run_con_original.py  --do_eval --do_test --model_type roberta --model_name_or_path $pretrained_model --train_filename $train_file --dev_filename $dev_file --output_dir $output_dir --max_source_length $source_length --train_batch_size $batch_size --eval_batch_size $batch_size --learning_rate $lr --num_train_epochs $epochs --test_filename $test_file