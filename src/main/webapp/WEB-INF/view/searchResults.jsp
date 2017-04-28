<!DOCTYPE html>
<div>
	<script id="resultsTemplate" type="text/x-handlebars-template">
		{{#if error}}
			<h2><b>{{error}}</b></h2>
		{{else}}
	
			{{#each responseData.results}}
				<div class="panel panel-default">
	  				<div class="panel-heading">
	    				<h3 class="panel-title">{{{title}}}</h3>
	  				</div>
	  				<div class="panel-body">
	    				{{{content}}} - <a href="{{url}}" target="_blank">{{url}}</a>
	  				</div>
				</div>
			{{/each}}
	
		{{/if}}
	</script>
</div>
<div id="resultsDiv"></div>